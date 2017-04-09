#!/usr/bin/env bash
#
# Script variables
#
cierralo_home="/root/SIIPG_Reports"
environment=""
log_home="/var/log/"
verbose=''
stacktrace=''
start_server='false'
#
# Grails/Java related
#
target_dir="build/libs/" #created by grails
grails_bin=$(which grails)
java_location=$(which java)
#
# Commands to be executed
#
run_war="$java_location -jar SIIPG_Reports-*.war"
#
# Help function
#
usage() {
    echo "***** SIIPGReports deployment script *****\n";
    echo " -- -- -- -- -- -- -- -- -- -- -- -- -- -- --  \n";
    echo "Usage: $0 -flag1 -flag2 ... \n";
    echo " -- -- -- -- -- -- -- -- -- -- -- -- -- -- --  \n";
    echo "Flags description \n";
    echo " -- -- -- -- -- -- -- -- -- -- -- -- -- -- --  \n";
    echo "Flag \tValue \tDescription"
    echo "-e \tENV \tdev,prod ";
    echo "-l \tLOG \tLogs location";
    echo "-p \tHOME \tProject location";
    echo ""
    echo "-h \t \tShows the help";
    echo "-r \t \tStarts embedded tomcat";
    echo "-s \t \tEnables stacktrace for war creation";
    echo "-v \t \tEnables verbose for war creation";
    exit 1;
}

while getopts 'e:l:p:hsvr' flag; do
  case "${flag}" in
    e) environment="${OPTARG}" ;;
    l) log_home="${OPTARG}";;
    p) cierralo_home="${OPTARG}" ;;
    r) start_server="true";;
    s) stacktrace='--stacktrace' ;;
    v) verbose='--verbose' ;;
    h) usage;;
    *) usage;;
  esac
done

if [ "$environment" = "dev" ] || [ "$environment" = "prod" ]; then
    #
    # Commands to be executed
    #
    grails_clean="$grails_bin clean"
    grails_war="$grails_bin $environment war $verbose $stacktrace"
    #
    # Show the variables used
    #
    echo "**************************************************************************************************************"
    echo "------------------ Variables ---------------------------"
    echo "> USER: $(whoami)"
    echo "> SIIPG_HOME: $cierralo_home"
    echo "> LOG_HOME: $log_home"
    echo "> ENVIRONMENT: $environment"
    echo "> GRAILS_LOCATION: $grails_bin"
    echo "> JAVA_LOCATION: $java_location"
    echo "------------------ Flags -------------------------------"
    echo "> VERBOSE: $verbose"
    echo "> START SERVER: $start_server"
    echo "> STACKTRACE: $stacktrace"
    echo "------------------ Commands ----------------------------"
    echo "> GRAILS_CLEAN: $grails_clean"
    echo "> GRAILS_WAR: $grails_war"
    echo "> RUN_WAR: $run_war"
    echo "**************************************************************************************************************"
    #
    # set the log home
    #
    export CIERRALO_LOG_HOME="$log_home"
    cd "$cierralo_home"
    eval $grails_clean
    eval $grails_war
    echo "********************* War file has been generated"
else
    echo "Environment not recognized!!!"
    exit 1
fi

if [ "$start_server" = "true" ]; then
    echo "******************* Starting server ...."
    cd "$target_dir"
    eval $run_war
    exit 1
fi


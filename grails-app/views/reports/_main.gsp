<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <style>
    @page {
        size: 210mm 297mm;
        @bottom-center {
            content: element(footer);
        }
        @top-center {
            content: element(header);
        }
    }

    div.break {
        page-break-after: always;
    }

    img {
        page-break-inside: avoid;
    }

    table.header {
        border: thin 1px red solid;
    }
    </style>
</head>

<body>
    <g:render template="layout/header" model="[content: content]"></g:render>
    ${raw(content.html)}
    <br/>
    <br/>
    <table class="header" width="100%">
        <tr>
            <td width="5%">
                &nbsp;
            </td>
            <td width="90%" style="text-align: center">
                <img src="${image}"/>
            </td>
            <td width="5%">
                &nbsp;
            </td>
        </tr>
    </table>

</body>
</html>

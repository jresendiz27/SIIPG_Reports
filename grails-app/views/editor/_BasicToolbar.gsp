<ckeditor:config var="toolbar_Basic">
    [
        { name: 'basicstyles', items: ['Bold', 'Italic', 'Underline', 'Strike', 'Subscript', 'Superscript', '-', 'RemoveFormat'] },
        { name: 'paragraph', items: ['NumberedList', 'BulletedList', '-', 'Outdent', 'Indent', '-', 'Blockquote'] },
        { name: 'styles', items: ['Format', 'FontSize', 'TextColor'] },
        { name: 'format', items: ['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock'] },
        '/',
        { name: 'clipboard', items: [ 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'Undo', 'Redo' ] },
        { name: 'links', items: [ 'Link'] },
        { name: 'insert', items: [ 'Table', 'HorizontalRule', 'SpecialChar' ] },
        { name: 'tools', items: [ 'Maximize' ] }
    ]
</ckeditor:config>

<div class="form-group">
    <label for="title">Title:</label>
    <input type="text" name="title" value="${content.title}" class="form-control" id="title">
</div>
<hr>
<ckeditor:editor name="html" height="400px" width="80%" toolbar="Basic">
    ${content.html}
</ckeditor:editor>
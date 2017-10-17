<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/jquery.treeview.css">

</head>
<title>CSS3点击显示</title>
<title>上中下布局</title>
<style type="text/css">
  .top {
    position: absolute;
    left: 178px; right: 0;
    height: 72px;
  }
  .sidebar {
    position: absolute;
    left: 0; top: 72px; bottom: 0;
    width: 178px;
  }
  .content {
    position: absolute;
    left:178px; top: 72px; right: 0; bottom: 0;
  }
</style>
<div class="top">
  <ul class="nav nav-tabs">
    <li role="presentation" class="active"><a href="#">红烧豆腐</a></li>
    <li role="presentation"><a href="#">水电费</a></li>
  </ul>
</div>
<div class="sidebar">
  <ul class="filetree" id="tree">
    <li><span class="folder">Folder</span>
      <ul>
        <li><span class="file">bbbb</span></li>
      </ul>
    </li>
  </ul>
</div>
<div class="content">
  <h1>sdfsdfsfd</h1>
  <form>sdfsdfsdf</form>
</div>

<script  src="js/jquery-3.2.1.min.js"></script>
<script  src="js/jquery.treeview.js"></script>
<script src="js/bootstrap.js"></script>
<script>
    $("#tree").treeview();
</script>
</html>


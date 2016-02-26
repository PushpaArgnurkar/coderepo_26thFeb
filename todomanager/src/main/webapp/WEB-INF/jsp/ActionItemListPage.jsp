<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script>
function showAddForm() {
	document.getElementById("addForm").style.visibility = "visible";
	document.getElementById("addForm").style.height = "90px";
}
function hideAddForm() {
	document.getElementById("addForm").style.visibility = "hidden";
	document.getElementById("addForm").style.height = "90px";
}
function hideEditForm() {
	document.getElementById("editForm").style.visibility = "hidden";
	document.getElementById("editForm").style.height = "90px";
}
function showEditForm() {
	document.getElementById("editForm").style.visibility = "visible";
	document.getElementById("editForm").height = "90px";
}

function deleteConfirmation()
{
	var res;
	var r = confirm("Are you sure you want to delete the record?");
	if (r == true) {
	    txt = "call action";
	} 
}
function doConfirm(msg, yesFn, noFn)
{
    var confirmBox = $("#confirmBox");
    confirmBox.find(".message").text(msg);
    confirmBox.find(".yes,.no").unbind().click(function()
    {
        confirmBox.hide();
    });
    confirmBox.find(".yes").click(yesFn);
    confirmBox.find(".no").click(noFn);
    confirmBox.show();
}
doConfirm("Are you sure?", function yes()
{
    form.submit();
}, function no()
{
    // do nothing
});
</script>
<style>
header {
	background-color: lightblue;
	color: white;
	text-align: center;
	padding: 5px;
}

nav {
	line-height: 30px;
	background-color: #eeeeee;
	height: 450px;
	width: 100px;
	float: left;
	padding: 5px;
}

section {
	width: 350px;
	float: left;
	padding: 10px;
}

footer {
	background-color: lightblue;
	color: white;
	clear: both;
	text-align: center;
	padding: 5px;
}

.tableStyle {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 5px;
	text-align: center;
}
</style>
<script>
	
	
	function deleteConfirmation()
	{
		var txt;
		var r = confirm("Press a button!");
		if (r == true) {
		    txt = "You pressed OK!";
		} else {
		    txt = "You pressed Cancel!";
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ActionItem List Page</title>
</head>
<body onload="initstate()">
	<header>
	<h1>TODO Manager</h1>
	</header>
	<!-- <div id="confirmBox">
    <div class="message"></div>
    <span class="yes">Yes</span>
    <span class="no">No</span>
	</div> -->
	<nav>
	<table>
		
		<tr>
			<td>Inbox</td>
		</tr>
        <br/>
		<tr>
			<td>Type</td>
		</tr>
		<tr>
			<td><select name="cars">
					<option value="a">Personal</option>
					<option value="b">Professional</option>
					<option value="c">WishList</option>
			</select></td>
		</tr>
		<br/><br/>
		<tr>
			<td>Priority</td>
		</tr>
		<tr>
			<td><select name="cars">
					<option value="volvo">High</option>
					<option value="saab">Low</option>
					<option value="fiat">Medium</option>
			</select>
			</td>
		</tr>
	</table>

	</nav>

	<section style="text-align: center">

		<div style="text-align: center">
			<div id="editForm" style="visibility: hidden; height:5px">
				<fieldset style="width: 380px; height:90px; bottom-width: thin; border-color:aqua;" >
					<legend>Edit ActionItem</legend>
					<form name="" action="editActionItem" method="post" style="text-align: center">
						<table style="text-align: center">
							<tr>
								<td>ActionItem :</td><td><input type="textarea" name="actionItem"/></td>
								<td>Priority :</td><td><select name="cars">
																<option value="a">High</option>
																<option value="b">Medium</option>
																<option value="c">Low</option>
													  </select>
								</td>
							</tr>
							<tr style="text-align:center">
							    <td><br><br><br></td>
								<td><input type="submit" value="   Update   " onclick="hideEditForm()" /></td>
							</tr>
						</table>
					</form>
				</fieldset>
			</div>

		<div id="addForm" style="visibility: hidden; height:5px;" >
				<fieldset style="width: 380px; height:90px; bottom-width: thin; border-color:aqua;" >
					<legend>Edit ActionItem</legend>
					<form name="" action="addActionItem" method="post" style="text-align: center">
						<table style="text-align: center">
							<tr>
								<td>ActionItem :</td><td><input type="textarea" name="actionItem"/></td>
								<td>Priority :</td><td><select name="cars">
																<option value="a">High</option>
																<option value="b">Medium</option>
																<option value="c">Low</option>
													  </select>
								</td>
							</tr>
							<tr style="text-align:center">
							    <td><br><br><br></td>
								<td><input type="submit" value="   Save   "  onclick="hideAddForm()"/></td>
							</tr>
						</table>
					</form>
				</fieldset>
			</div>
			
			<div style="text-align:center; width:700px; border-color:aqua;">
			<h2>ActionItem List</h2>

			<table  style="text-align:center; width:750px;  bordercolor="aqua" border="1" >
				<tr style=background-color:lightblue;" >
					<th>ActionItem</th>
					<th>Priority</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<c:forEach items="${actionItemListContainer.actionItemList}"
					var="actionItem" varStatus="status">
					<tr>
						<td align="left" width="500px"><input type="checkbox">${actionItem.actionItem}</td>
						<td >${actionItem.priority}</td>
						
						<td ><a href="#">  Edit  </a></td>
						<td ><a href="#" >  Remove </a></td>
					</tr>
				</c:forEach>
			</table>
			<br />
			<table>
				<tr>
					<td><input type="button" value="Add New" onclick="showAddForm()"></td>
				</tr>
			</table>
			</div>
		</div>

	</section>



</body>
</html>


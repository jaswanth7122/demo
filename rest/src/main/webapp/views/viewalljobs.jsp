<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="container">
    <c:forEach var="jobpost" items="${jobposts}">
        <div class="card">
            <h5>${jobpost.postprofile}</h5>
            <p>Description: ${jobpost.postdescription}</p>
            <p>Experience: ${jobpost.experience}</p>
           
        </div>
    </c:forEach>
</div>
</body>
</html>
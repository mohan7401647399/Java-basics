function showCourses() {
    fetch("http://localhost:8080/course/allcourses")
        .then((response) => response.json())
        .then((courses) => {
            const dataTable = document.getElementById("courseTable");

            courses.forEach((course) => {
                const row = `<tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.trainer}</td>
                <td>${course.durationInWeeks}</td>
            </tr>`
                dataTable.innerHTML += row;
            })
        })
}



function enrolledCourses() {
    fetch("http://localhost:8080/course/enrolled")
        .then((response) => response.json())
        .then((courses) => {
            const dataTable = document.getElementById("enrolledTable");

            courses.forEach((course) => {
                const row = `<tr>
                <td>${course.name}</td>
                <td>${course.email}</td>
                <td>${course.courseName}</td>
            </tr>`

                dataTable.innerHTML += row;
            })
        })
}
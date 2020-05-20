Database Name : feedback

***********FEEDBACK MICROSERVICE: 5053***********
1- Add Feedback
    PostMapping : http://localhost:5053/faculty/addFaculty
    Json Sample :
    {	
	"trainingCode":
	{	
		"trainingCode":1,
		"course":{
			"courseId":1,
			"courseName":"JAVA",
			"noOfDays":50
			},
		"faculty":{
			"facultyId":1,
			"facultyName":"ABC",
			"listOfSkillSet":[{
				"skillName":"abc"
				
			}]
			},
		"startDate":"2020-02-02",
		"endDate":"2020-04-04"
	},
	"participantId":{"employeeId":1,"employeeName":"Shivani","password":"1234","role":"Participant"},
	"fbPrsComm":5,
	"fbClrfyDbts":5,
	"fbTm":5,
	"fbHndOut":5,
	"fbHwSwNtwrk":5,
	"comments":"Insert Comments here",
	"suggestions":"Insert Suggestions here",
	"feedbackDate":"2020-02-02"
}

2- Get All Feedbacks
    GetMapping : localhost:5053/feedback/allFeedback

3- Get Feedback By Faculty Id
    GetMapping : localhost:5053/feedback/forEachFaculty/{facultyId}

4- Get Feedback By Training Code
    GetMapping : localhost:5053/feedback/forEachTrainingProgram/{trainingCode}


*********FACULTY MICROSERVICE : 5053**************
1- Add Faculty
    PostMapping : http://localhost:5053/faculty/addFaculty
    Json Sample :
     {
        "facultyName": "TestFaculty",
        "listOfSkillSet": [
        	 {
        	 "skillId":3,
        	"skillName": "Microservice"
    		},
    		{
    		"skillId":2,
    		"skillName":"AWS"
    		}]
    }

2- Get All Faculties
    GetMapping: http://localhost:5053/faculty/getAllFaculty

3- Delete Faculty
    PostMapping: http://localhost:5053/faculty/deleteFaculty/{facultyId}

4- Get Faculty By Id
    GetMapping: http://localhost:5053/faculty/getFacultyById/{facultyId}

************Skills Microservice : 5055*************
1- Add Skill
    PostMapping : http://localhost:5055/coordinator/addskills
    Json Sample :
    {
        "skillName": "C++"
    }

2- Get Skills By SkillName
    GetMapping : http://localhost:5055/coordinator/allskills/{skillName}

3- Delete Skill By Skill Name
    DeleteMapping : http://localhost:5055/coordinator/deleteSkill/{skillName}

4- Get All Skills
    GetMapping : http://localhost:5055/coordinator/allskills


**************Training Program : 5056***********
1- Add Training Program
    PostMapping : http://localhost:5056/admin/addTrainingProgram
    Json Sample : 
    {
        "course": {
            "courseId": 1,
            "courseName": "JAVA",
            "noOfDays": 50
        },
        "faculty": {
    	"facultyId":34,
        "facultyName": "TestFaculty",
        "listOfSkillSet": [
        	 {
        	 "skillId":3,
        	"skillName": "Microservice"
    		},
    		{
    		"skillId":2,
    		"skillName":"AWS"
    		}]
    },
        "startDate": "2020-02-01",
        "endDate": "2020-04-03"
}

2- Get All TrainingProgram
    GetMapping : http://localhost:5056/admin/getAllTrainingProgramList

3- Get Training Program By Id 
    GetMapping: http://localhost:5056/admin/getTrainingById/{id}

4- Delete Training Program By Id
    DeleteMapping ; http://localhost:5056/admin/deleteTrainingProgram/{id}



**************Course : 5057***********
1- Add TCourse
    PostMapping : http://localhost:5057/admin/addCourse
    Json Sample : 
    {
    "courseName": "Microservices",
    "noOfDays": 15
}

2- Get All Courses
    GetMapping : http://localhost:5057/admin/getAllCourseList

3- Get Course By Id 
    GetMapping: http://localhost:5057/admin/getCourseById/{id}

4- Delete Course By Id
    DeleteMapping ; http://localhost:5057/admin/deleteCourse/{id}



    //Hopefully works!

import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { Course } from "./course";
import { CourseService } from "./course.service";

@Component({
    templateUrl: './course-info.component.html'
})
export class CourseInfoComponent implements OnInit {
    
    course: Course;

    constructor(private activatedRoute: ActivatedRoute, private courseService: CourseService){
    }

    ngOnInit(): void { 
        this.courseService.retrieveById(+this.activatedRoute.snapshot.paramMap.get('id')).subscribe({
            next: course => this.course = course,
            error: err => console.log('Error', err)
        });
    }

    save(): void{
        this.courseService.save(this.course);
    }
}

//    "strictNullChecks": false
/*
Adicionar a anotacao acima nos tsconfig.json
In addition to all the answers mentioned above, still if the user doesn't want the strict null checks in its application, 
we can just simply disable the strictNullChecks property in our tsconfig.json file.
*/
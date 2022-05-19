import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentDashboardComponent } from './student-dashboard/student-dashboard.component';
import  { StudentLoginComponent } from './student-login/student-login.component'
import { LogoutComponent } from './logout/logout.component';
import { JavaExamComponent } from './java-exam/java-exam.component';
import { HtmlExamComponent } from './html-exam/html-exam.component';
import { CPPExamComponent } from './cpp-exam/cpp-exam.component';
import { ExamResultComponent } from './exam-result/exam-result.component';
import { ExamResulthtmlComponent } from './exam-resulthtml/exam-resulthtml.component';
import { SignupComponent } from './signup/signup.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { QuestionComponent } from './question/question.component';
import { AddquestionComponent } from './addquestion/addquestion.component';
import { RemovequestionComponent } from './removequestion/removequestion.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
const routes: Routes = [{path:'',redirectTo:'login',pathMatch:'full'},{path:'login',component:StudentLoginComponent},{path:'dashboard',component:StudentDashboardComponent},
{path:'logout',component:LogoutComponent},{path:'exam',component:JavaExamComponent},{path:'exam1',component:HtmlExamComponent},{path:'exam2',component:CPPExamComponent},
{path:'exam-result',component:ExamResultComponent},{path:'resulthtml',component:ExamResulthtmlComponent},
{path:'signup', component:SignupComponent},{path:'adminlogin',component:AdminloginComponent},
{path:'admindashboard',component:AdmindashboardComponent},{path:'question',component:QuestionComponent},
{path:'addquestion',component:AddquestionComponent},{path:'removequestion',component:RemovequestionComponent},{path:'forgotpassword',component:ForgotpasswordComponent}
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

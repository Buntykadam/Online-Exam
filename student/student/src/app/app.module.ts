import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentLoginComponent } from './student-login/student-login.component';
import { StudentDashboardComponent } from './student-dashboard/student-dashboard.component';
import { LogoutComponent } from './logout/logout.component';
import { ExamDashboardComponent } from './exam-dashboard/exam-dashboard.component';
import { JavaExamComponent } from './java-exam/java-exam.component';
import { HtmlExamComponent } from './html-exam/html-exam.component';
import { CPPExamComponent } from './cpp-exam/cpp-exam.component';
import { ExamResultComponent } from './exam-result/exam-result.component';
import { ExamResulthtmlComponent } from './exam-resulthtml/exam-resulthtml.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { QuestionComponent } from './question/question.component';
import { AddquestionComponent } from './addquestion/addquestion.component';
import { RemovequestionComponent } from './removequestion/removequestion.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    StudentLoginComponent,
    StudentDashboardComponent,
    LogoutComponent,
    ExamDashboardComponent,
    JavaExamComponent,
    HtmlExamComponent,
    CPPExamComponent,
    ExamResultComponent,
    ExamResulthtmlComponent,
    LoginComponent,
    SignupComponent,
    AdminloginComponent,
    AdmindashboardComponent,
    QuestionComponent,
    AddquestionComponent,
    RemovequestionComponent,
    ForgotpasswordComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

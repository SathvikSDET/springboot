<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
  font-family: helvetica, sans-serif;
}

fieldset {
  min-height: 200px;
}

.standard-label, .standard-input {
    display: block;
}

.standard-label {
  margin-bottom: 20px;
}

.standard-input, .standard-select {
  margin-top: 10px;
  border: 3px lightsteelblue solid;
  border-radius: 5px;
  padding: 2px;
}

.standard-input {
  height: 25px;
  width: 250px;
  font-size: 1em;
}

.standard-select {
  height: 32px;
  width: 150px;
  font-size: 1em;
}

#account-select {
  width: 260px;
}

.container {
  width: 70%;
  max-width: 800px;
  margin: 0 auto;
  border: 1px black solid;
  padding: 10px;
  background-color: lightsteelblue; 
}

.sub-container {
  padding-left: 10px;
  background-color: white;
  margin: 10px auto;
}

.required {
  font-size: 1.5em;
  color: red;
}

.small-heading {
  font-size: 18px;
}

.radio-label {
  font-size: 20px;
  margin: 0 40px;
}

.radio-input {
  margin-bottom: 25px;
}

button {
  border: 2px black solid;
  background-color: lightsteelblue;
  border-radius: 5px;
  margin: 0 auto;
  height: 35px;
  width: 150px;
  font-size: 20px;
}
input[type="date"]::-webkit-calendar-picker-indicator {
    color: rgba(0, 0, 0, 0);
    opacity: 1;
    display: block;
    background: url(https://mywildalberta.ca/images/GFX-MWA-Parks-Reservations.png) no-repeat;
    width: 20px;
    height: 20px;
    border-width: thin;
}

#show-address {
  display: none;
  float: right;
}

#address-history {
  display: none;
}

#non-uk {
  display: none;
  text-align: center;
  font-size: 25px;
  color: red;
}

#current-address {
  display: none;
}

#previous-address {
  display: none;
}

#get-consent {
  display: none;
  float: right;
}

#your-consent {
  display: none;
}

#info-request {
  display: none;
}

#submit-app {
  display: none;
  border: 2px black solid;
  background-color: lightsteelblue;
  border-radius: 5px;
  margin: 15px auto;
  height: 35px;
  width: 180px;
  font-size: 20px;
  float: right;
}

input[type="checkbox"] {
  height: 50px;
  width: 30px;
  margin-top: 20px;
  margin-left: 45px;
}
/** Media Queries **/

@media screen and (max-width: 1100px) {
  
  h1 {
    font-size: 24px; 
  }
  
  h2 {
    font-size: 24px;
  }
  .container {
    width: 95%;
  }
}

</style>
<body>
<div class="container">
    <h1 class="main-header">Account Application Form.</h1>
    <hr>
    
    
    <form  action="bocReg" method="post">
      <h2 class="sub-heading">Basic Details</h2>
      <hr>
        <label for="dropdown" class="standard-label">
          Title<span class="required">*</span>
          <br>
          <select  id="dropdown" class="standard-select" required>
            <option value="select" disabled selected>Select Title</option>
            <option value="Mr">Mr</option>
            <option value="Mrs">Mrs</option>
            <option value="Miss">Miss</option>
            <option value="Ms">Ms</option>
            <option value="Dr">Dr</option>
            <option value="Prof">Prof</option>
          </select>
        </label>
        <label for="Firstname" class="standard-label">
          First Name<span class="required">*</span>
          <input class="standard-input" name="Firstname" id="Firstname" type="text" placeholder="First name..." required>
        </label>
        <label for="Middlenames" class="standard-label">
          Middle Names (If Applicable)
          <input class="standard-input" name="Middlenames" id="Middlenames" type="text" placeholder="Middle names...">
        </label>
        <label for="Lastname" class="standard-label">
          Last Name<span class="required">*</span>
          <input class="standard-input" name="Lastname" id="Lastname" type="text" placeholder="Last name..." required>
        </label>
        <label for="Phonenumber" class="standard-label">
          Phone Number<span class="required">*</span>
          <input class="standard-input" type="tel" id="Phonenumber" name="Phonenumber" pattern='^\+?\d{10,12}' placeholder="Example: 01925999111" required>
        </label>
        <label for="Email" class="standard-label">
          Email<span class="required">*</span>
          <input class="standard-input" id="Email" type="text" placeholder="Your email address..." required>
        </label>
        
        <label for="typeofaccount" class="standard-label">
          What type of account are you applying for?<span class="required">*</span>
          <br>
          
          <select  id="typeofaccount" class="standard-select" required>
            <option value="select" disabled selected>Choose Account</option>
            <option value="basic-current">Basic Current Account</option>
            <option value="premium-current">Premium Current Account</option>
            <option value="instant-saver">Instant Access Savings Account</option>
            <option value="lifetime-isa">Lifetime ISA</option>
            <option value="help-to-buy">Help to Buy ISA</option>
          </select>
        </label>
        
   <button type="submit">Save</button>
       
    </form>
  </div>
</body>
</html>
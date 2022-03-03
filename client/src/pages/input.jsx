import React from "react";
import {
  Page,
  Card,
  Navbar,
  List,
  ListInput,
  Button,
  Box,
  zmp,
} from "zmp-framework/react";

export default () => {
  const handleOnSubmitForm = (e) => {
    e.preventDefault();
    console.log(zmp.form.convertToData("#my-form"));
  };

  const handleFillForm = (e) => {
    e.preventDefault();
    zmp.form.fillFromData("#my-form", {
      fullName: "John",
      age: 20,
      password: "Aa123456",
      city: 2,
    });
  };

  return (
    <Page className="page-inputs page-with-navbar">
      <Box>
        <Card inset title="Form">
          <List
            style={{ listStyle: "none" }}
            form
            id="my-form"
            onSubmit={handleOnSubmitForm}
            noHairlines
          >
            <ListInput
              label="User name"
              type="text"
              placeholder="Enter your user name"
              clearButton
              info="Your user name"
              name="username"
              pattern="^[a-zA-Z]{2,30}$"
              required
              errorMessage="Invalid"
              validate
            ></ListInput>
            <ListInput
              label="Password"
              type="password"
              placeholder="Enter your password"
              clearButton
              required
              info="Password between 6 to 20 characters which contain at least one numeric digit, one uppercase and one lowercase letter"
              name="password"
              errorMessage="Password between 6 to 20 characters which contain at least one numeric digit, one uppercase and one lowercase letter"
              pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$"
              validate
            ></ListInput>
            <ListInput
              label="Your message"
              type="text"
              placeholder="Enter your message"
              clearButton
              info="Your message"
              name="message"
            ></ListInput>
         
            <Box>
              <Button type="submit" typeName="secondary" responsive>
                Start
              </Button>
            </Box>
            <Box>
        
            </Box>
          </List>
        </Card>
      </Box>
    </Page>
  );
};

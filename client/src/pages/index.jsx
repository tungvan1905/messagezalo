import React from "react";
import { Page, List, ListItem, Box, Card } from "zmp-framework/react";

export default () => {
  return (
    <Page noNavbar>
      <Box m="0" p="0">
        <Card>
          <List>
          <ListItem link="/input">Input</ListItem>
          </List> 
        </Card>
      </Box>
    </Page>
  );
};

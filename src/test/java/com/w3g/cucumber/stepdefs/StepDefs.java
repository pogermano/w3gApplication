package com.w3g.cucumber.stepdefs;

import com.w3g.W3GApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = W3GApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author luisfelipe
 */
public class PaginaInicialEstudante {

    @FindBy(name= "ConfirmPasswd")
    private WebElement confirmPassword;
    @FindBy(id = "courses-button")
    private WebElement cursos;
    @FindBy(id = "phoneNumberId")
    private WebElement telefone;
    @FindBy(id = "gradsIdvPhoneNext")
    private WebElement botaoTelefone;
    private final WebDriver driver;
    private String url;
    public PaginaInicialEstudante(WebDriver driver){
        this.driver=driver;
    }
}
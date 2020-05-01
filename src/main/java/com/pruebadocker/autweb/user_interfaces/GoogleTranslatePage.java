package com.pruebadocker.autweb.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").locatedBy("//div[@class='sl-more tlid-open-source-language-list']");
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");
	public static final Target SEARCH_SOURCE_LENGUAGE = Target.the("Field to search a source lenguage").locatedBy("//input[@id='sl_list-search-box']");
	public static final Target SEARCH_TARGET_LENGUAGE = Target.the("Field to search a target lenguage").locatedBy("//input[@id='tl_list-search-box']");
	public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("//div[@class='language_list_languages language_list_sl_list tw-ll-top']/div[@class='language_list_item_wrapper language_list_item_wrapper-en']");
	public static final Target TARGET_LANGUAGE = Target.the("Target_lenguage").locatedBy("//div[@class='language_list_languages language_list_tl_list tw-ll-top']/div[@class='language_list_item_wrapper language_list_item_wrapper-es']");
	public static final Target SOURCE_LANGUEGE_TEXTAREA = Target.the("Source language textarea").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_TEXTAREA = Target.the("Target language result").locatedBy("//div[@class='tlid-result result-dict-wrapper']//span[@class='tlid-translation translation']");
	
}

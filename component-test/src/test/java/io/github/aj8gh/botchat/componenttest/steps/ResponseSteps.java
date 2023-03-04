package io.github.aj8gh.botchat.componenttest.steps;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java8.En;

public class ResponseSteps implements En {

  public ResponseSteps() {
    Given("this is a test step", () -> assertThat(1 + 1).isEqualTo(2));
  }
}

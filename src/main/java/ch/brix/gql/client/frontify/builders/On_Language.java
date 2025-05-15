package ch.brix.gql.client.frontify.builders;

public class On_Language extends ch.brix.gql.client.TypeBuilder {
  public On_Language() {
    super(new ch.brix.gql.client.On("Language"));
  }
  /**
   * **BETA** The ISO code of the language.
   */
  public On_Language code() {
    _add_field("code");
    return this;
  }
  /**
   * **BETA** The name of the language in English.
   */
  public On_Language name() {
    _add_field("name");
    return this;
  }
}

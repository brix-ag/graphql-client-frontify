package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelineDocument extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelineDocument() {
    super(new ch.brix.gql.client.On("CreateGuidelineDocument"));
  }
  /**
   * **BETA** The ID of the created document.
   */
  public On_CreateGuidelineDocument id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the created document.
   */
  public On_CreateGuidelineDocument title() {
    _add_field("title");
    return this;
  }
}

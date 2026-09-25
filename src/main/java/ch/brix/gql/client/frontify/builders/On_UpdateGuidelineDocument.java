package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelineDocument extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelineDocument() {
    super(new ch.brix.gql.client.On("UpdateGuidelineDocument"));
  }
  /**
   * **BETA** The ID of the updated document.
   */
  public On_UpdateGuidelineDocument id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the document after the update.
   */
  public On_UpdateGuidelineDocument title() {
    _add_field("title");
    return this;
  }
}

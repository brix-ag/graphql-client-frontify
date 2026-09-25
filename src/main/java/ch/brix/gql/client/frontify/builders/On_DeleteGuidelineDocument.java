package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelineDocument extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelineDocument() {
    super(new ch.brix.gql.client.On("DeleteGuidelineDocument"));
  }
  /**
   * **BETA** The ID of the deleted document.
   */
  public On_DeleteGuidelineDocument id() {
    _add_field("id");
    return this;
  }
}

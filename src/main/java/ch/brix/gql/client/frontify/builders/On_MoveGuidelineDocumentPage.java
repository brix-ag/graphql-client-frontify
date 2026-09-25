package ch.brix.gql.client.frontify.builders;

public class On_MoveGuidelineDocumentPage extends ch.brix.gql.client.TypeBuilder {
  public On_MoveGuidelineDocumentPage() {
    super(new ch.brix.gql.client.On("MoveGuidelineDocumentPage"));
  }
  /**
   * **BETA** The ID of the moved guideline document page.
   */
  public On_MoveGuidelineDocumentPage id() {
    _add_field("id");
    return this;
  }
}

package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelineDocumentPage extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelineDocumentPage() {
    super(new ch.brix.gql.client.On("DeleteGuidelineDocumentPage"));
  }
  /**
   * **BETA** The ID of the deleted document page.
   */
  public On_DeleteGuidelineDocumentPage id() {
    _add_field("id");
    return this;
  }
}

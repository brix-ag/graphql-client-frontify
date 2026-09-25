package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelineDocumentPageCategory extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelineDocumentPageCategory() {
    super(new ch.brix.gql.client.On("DeleteGuidelineDocumentPageCategory"));
  }
  /**
   * **BETA** The ID of the deleted document page category.
   */
  public On_DeleteGuidelineDocumentPageCategory id() {
    _add_field("id");
    return this;
  }
}

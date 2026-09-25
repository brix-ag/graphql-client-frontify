package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelineDocumentPageLink extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelineDocumentPageLink() {
    super(new ch.brix.gql.client.On("DeleteGuidelineDocumentPageLink"));
  }
  /**
   * **BETA** The ID of the deleted document page link.
   */
  public On_DeleteGuidelineDocumentPageLink id() {
    _add_field("id");
    return this;
  }
}

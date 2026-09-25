package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelineDocumentPageLink extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelineDocumentPageLink() {
    super(new ch.brix.gql.client.On("CreateGuidelineDocumentPageLink"));
  }
  /**
   * **BETA** The ID of the created document page link.
   */
  public On_CreateGuidelineDocumentPageLink id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the created document page link.
   */
  public On_CreateGuidelineDocumentPageLink title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The link URL of the created document page link.
   */
  public On_CreateGuidelineDocumentPageLink url() {
    _add_field("url");
    return this;
  }
}

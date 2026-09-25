package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelineDocumentPageLink extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelineDocumentPageLink() {
    super(new ch.brix.gql.client.On("UpdateGuidelineDocumentPageLink"));
  }
  /**
   * **BETA** The ID of the updated document page link.
   */
  public On_UpdateGuidelineDocumentPageLink id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the link after the update.
   */
  public On_UpdateGuidelineDocumentPageLink title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The link URL after the update.
   */
  public On_UpdateGuidelineDocumentPageLink url() {
    _add_field("url");
    return this;
  }
}

package ch.brix.gql.client.frontify.builders;

public class On_PublishGuidelineDocumentPage extends ch.brix.gql.client.TypeBuilder {
  public On_PublishGuidelineDocumentPage() {
    super(new ch.brix.gql.client.On("PublishGuidelineDocumentPage"));
  }
  /**
   * **BETA** The ID of the published guideline document page.
   */
  public On_PublishGuidelineDocumentPage id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document page is published.
   */
  public On_PublishGuidelineDocumentPage isPublished() {
    _add_field("isPublished");
    return this;
  }
}

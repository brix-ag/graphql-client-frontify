package ch.brix.gql.client.frontify.builders;

public class On_UnpublishGuidelineDocumentPage extends ch.brix.gql.client.TypeBuilder {
  public On_UnpublishGuidelineDocumentPage() {
    super(new ch.brix.gql.client.On("UnpublishGuidelineDocumentPage"));
  }
  /**
   * **BETA** The ID of the unpublished guideline document page.
   */
  public On_UnpublishGuidelineDocumentPage id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document page is published.
   */
  public On_UnpublishGuidelineDocumentPage isPublished() {
    _add_field("isPublished");
    return this;
  }
}

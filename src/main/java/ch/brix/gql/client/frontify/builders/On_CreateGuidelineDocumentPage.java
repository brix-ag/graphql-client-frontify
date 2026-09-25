package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelineDocumentPage extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelineDocumentPage() {
    super(new ch.brix.gql.client.On("CreateGuidelineDocumentPage"));
  }
  /**
   * **BETA** The ID of the created guideline document page.
   */
  public On_CreateGuidelineDocumentPage id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The ID of the document the guideline document page is created in.
   */
  public On_CreateGuidelineDocumentPage documentId() {
    _add_field("documentId");
    return this;
  }
  /**
   * **BETA** The title of the guideline document page id.
   */
  public On_CreateGuidelineDocumentPage title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The ID of the category the guideline document page is created in.
   */
  public On_CreateGuidelineDocumentPage categoryId() {
    _add_field("categoryId");
    return this;
  }
}

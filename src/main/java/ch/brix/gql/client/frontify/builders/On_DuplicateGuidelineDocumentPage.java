package ch.brix.gql.client.frontify.builders;

public class On_DuplicateGuidelineDocumentPage extends ch.brix.gql.client.TypeBuilder {
  public On_DuplicateGuidelineDocumentPage() {
    super(new ch.brix.gql.client.On("DuplicateGuidelineDocumentPage"));
  }
  /**
   * **BETA** The ID of the duplicated guideline document page.
   */
  public On_DuplicateGuidelineDocumentPage id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the duplicated guideline document page.
   */
  public On_DuplicateGuidelineDocumentPage title() {
    _add_field("title");
    return this;
  }
}

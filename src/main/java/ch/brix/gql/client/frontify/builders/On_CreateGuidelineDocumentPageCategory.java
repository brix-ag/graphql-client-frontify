package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelineDocumentPageCategory extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelineDocumentPageCategory() {
    super(new ch.brix.gql.client.On("CreateGuidelineDocumentPageCategory"));
  }
  /**
   * **BETA** The ID of the created document page category.
   */
  public On_CreateGuidelineDocumentPageCategory id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the created document page category.
   */
  public On_CreateGuidelineDocumentPageCategory title() {
    _add_field("title");
    return this;
  }
}

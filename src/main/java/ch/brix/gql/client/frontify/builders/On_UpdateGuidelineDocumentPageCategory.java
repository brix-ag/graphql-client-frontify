package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelineDocumentPageCategory extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelineDocumentPageCategory() {
    super(new ch.brix.gql.client.On("UpdateGuidelineDocumentPageCategory"));
  }
  /**
   * **BETA** The ID of the updated document page category.
   */
  public On_UpdateGuidelineDocumentPageCategory id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the document page category after the update.
   */
  public On_UpdateGuidelineDocumentPageCategory title() {
    _add_field("title");
    return this;
  }
}

package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for creating a guideline document page category.
 */
public class CreateGuidelineDocumentPageCategoryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the document the page category is created in.
   */
  public CreateGuidelineDocumentPageCategoryInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **BETA** The title of the document page category.
   */
  public CreateGuidelineDocumentPageCategoryInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
}

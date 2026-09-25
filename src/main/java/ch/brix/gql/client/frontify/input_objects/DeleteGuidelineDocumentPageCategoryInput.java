package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for deleting a guideline document page category.
 */
public class DeleteGuidelineDocumentPageCategoryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page category to delete.
   */
  public DeleteGuidelineDocumentPageCategoryInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}

package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for deleting a guideline document page link.
 */
public class DeleteGuidelineDocumentPageLinkInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page link to delete.
   */
  public DeleteGuidelineDocumentPageLinkInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}

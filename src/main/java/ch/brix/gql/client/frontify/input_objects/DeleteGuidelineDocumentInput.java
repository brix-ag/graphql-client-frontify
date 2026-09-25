package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for deleting a guideline document.
 */
public class DeleteGuidelineDocumentInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document to delete.
   */
  public DeleteGuidelineDocumentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}

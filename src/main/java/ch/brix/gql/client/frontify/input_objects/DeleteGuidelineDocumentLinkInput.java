package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for deleting a guideline document link.
 */
public class DeleteGuidelineDocumentLinkInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document link to delete.
   */
  public DeleteGuidelineDocumentLinkInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}

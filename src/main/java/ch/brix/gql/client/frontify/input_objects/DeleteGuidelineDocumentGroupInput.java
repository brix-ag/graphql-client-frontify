package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for deleting a guideline document group.
 */
public class DeleteGuidelineDocumentGroupInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document group to delete.
   */
  public DeleteGuidelineDocumentGroupInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}

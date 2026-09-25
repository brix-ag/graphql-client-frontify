package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for duplicating a guideline document page.
 */
public class DuplicateGuidelineDocumentPageInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page to duplicate.
   */
  public DuplicateGuidelineDocumentPageInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}

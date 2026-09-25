package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for moving a guideline document page to a different document and/or category.
 */
public class MoveGuidelineDocumentPageInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document page to move.
   */
  public MoveGuidelineDocumentPageInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The ID of the parent to move the guideline document page to. Can be either a GuidelineDocument or a GuidelineDocumentPageCategory
   */
  public MoveGuidelineDocumentPageInput targetParentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("targetParentId", v);
    return this;
  }
  /**
   * **BETA** The sort position of the guideline document page among its new siblings. Omit it to place it last.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public MoveGuidelineDocumentPageInput sort(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("sort", v);
    return this;
  }
}

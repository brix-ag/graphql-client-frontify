package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for creating a guideline document group.
 */
public class CreateGuidelineDocumentGroupInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the entity to create the document group in (Guideline).
   */
  public CreateGuidelineDocumentGroupInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **BETA** The title of the document group.
   */
  public CreateGuidelineDocumentGroupInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
}

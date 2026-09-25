package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for creating a guideline document.
 */
public class CreateGuidelineDocumentInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the entity to create the document in (Guideline or Document Group).
   */
  public CreateGuidelineDocumentInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **BETA** The title of the document.
   */
  public CreateGuidelineDocumentInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
}

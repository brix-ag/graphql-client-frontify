package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for updating a guideline document.
 */
public class UpdateGuidelineDocumentInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the guideline document to update.
   */
  public UpdateGuidelineDocumentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The new title of the document.
   */
  public UpdateGuidelineDocumentInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** Language code the title is written in. Omit it (or pass the default language) to update the base title; pass a non-default language to update that translation.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public UpdateGuidelineDocumentInput language(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("language", v);
    return this;
  }
}

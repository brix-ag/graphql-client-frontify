package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for creating a guideline document library.
 */
public class CreateGuidelineDocumentLibraryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the entity to create the document library in (Guideline or Document Group).
   */
  public CreateGuidelineDocumentLibraryInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **BETA** The title of the document library.
   */
  public CreateGuidelineDocumentLibraryInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** The library ID
   */
  public CreateGuidelineDocumentLibraryInput libraryId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("libraryId", v);
    return this;
  }
  /**
   * **BETA** The heading of the document library.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateGuidelineDocumentLibraryInput heading(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("heading", v);
    return this;
  }
  /**
   * **BETA** The subheading of the document library.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateGuidelineDocumentLibraryInput subheading(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("subheading", v);
    return this;
  }
}

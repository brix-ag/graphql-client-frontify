package ch.brix.gql.client.frontify.input_objects;

public class CreateAssetInput extends ch.brix.gql.client.InputObject {
  /**
   * **DEPRECATED** `Library` or `Workspace` Id. This value is ignored if `parentId` is set. This field will be removed. Use `parentId` instead. | Date: 2023-07-01T00:00:00.000+00:00
   */
  public CreateAssetInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * File Id. Signed Id returned in `uploadFile`.
   */
  public CreateAssetInput fileId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("fileId", v);
    return this;
  }
  /**
   * `Asset` title or display name.
   */
  public CreateAssetInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** Alternative text for the `Asset`. Used by screen readers when the asset is not decorative.
   */
  public CreateAssetInput alternativeText(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("alternativeText", v);
    return this;
  }
  /**
   * **BETA** Indicates whether the `Asset` is decorative and not meant to be read by screen readers. If true, alternative text is ignored.
   */
  public CreateAssetInput isDecorative(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isDecorative", v);
    return this;
  }
  /**
   * `Asset` description.
   */
  @ch.brix.gql.client.DefaultValue("\"\"")
  public CreateAssetInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
  /**
   * `Asset` external Id.
   */
  public CreateAssetInput externalId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("externalId", v);
    return this;
  }
  /**
   * Add `Asset` copyright details.
   */
  public CreateAssetInput copyright(ch.brix.gql.client.frontify.input_objects.CreateCopyrightInput v) {
    values.put("copyright", v);
    return this;
  }
  /**
   * List of tags to create with `Asset`
   */
  public CreateAssetInput tags(java.util.List<ch.brix.gql.client.frontify.input_objects.TagInput> v) {
    values.put("tags", v);
    return this;
  }
  /**
   * Skip file's EXIF metadata. When true, it will ignore all file metadata contents.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CreateAssetInput skipFileMetadata(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("skipFileMetadata", v);
    return this;
  }
  /**
   * An array of strings representing the directory, if a folder does not exist, it is created. Example: ["My Folder", "Sub-Folder"] will create the necessary folders if they do not yet exist and place the `Asset` in it. **Important:** Cannot be used in conjunction with `parentId` that is from a `Folder`.
   */
  public CreateAssetInput directory(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("directory", v);
    return this;
  }
  /**
   * The parent Id, where the `Asset` should be located in. Should either be a `Library`, `WorkspaceProject` or `Folder` Id. **Important:** Cannot be used in conjunction with `directory` if the Id is from a `Folder`.
   */
  public CreateAssetInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * **DEPRECATED** `Asset` workflow status. Workflow logic will be automatically managed if not properly set. This field will be removed. | Date: 2022-07-01T00:00:00.000+00:00
   */
  public CreateAssetInput workflowStatus(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("workflowStatus", v);
    return this;
  }
  /**
   * `Asset` will become available only during the interval.When undefined or `null` the `Asset` will be immediately and indefinitely available.
   */
  public CreateAssetInput availability(ch.brix.gql.client.frontify.input_objects.DateTimeRangeInput v) {
    values.put("availability", v);
    return this;
  }
  /**
   * `Asset` will expire once the defined date is reached.
   */
  public CreateAssetInput expiresAt(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("expiresAt", v);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name
   */
  @ch.brix.gql.client.DefaultValue("\"\"")
  public CreateAssetInput author(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("author", v);
    return this;
  }
  /**
   * **BETA** Background color of the `Asset` preview.
   */
  public CreateAssetInput previewBackgroundColor(ch.brix.gql.client.frontify.input_objects.RgbaColorInput v) {
    values.put("previewBackgroundColor", v);
    return this;
  }
}

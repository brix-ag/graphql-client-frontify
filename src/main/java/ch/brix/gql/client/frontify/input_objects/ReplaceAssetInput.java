package ch.brix.gql.client.frontify.input_objects;

public class ReplaceAssetInput extends ch.brix.gql.client.InputObject {
  /**
   * Parent `Asset` Id.
   */
  public ReplaceAssetInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * Signed file Id returned in `uploadFile`.
   */
  public ReplaceAssetInput fileId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("fileId", v);
    return this;
  }
  /**
   * Skip file's EXIF metadata. When true, it will ignore all file metadata contents.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public ReplaceAssetInput skipFileMetadata(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("skipFileMetadata", v);
    return this;
  }
}

package ch.brix.gql.client.frontify.input_objects;

public class UploadFileInput extends ch.brix.gql.client.InputObject {
  /**
   * `File` name. This value will be passed on to the `fileId` input variable used in file mutations such as `createAsset`, `replaceAsset`, `createAttachment` or `addAssetPreviewImage`.
   */
  public UploadFileInput filename(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("filename", v);
    return this;
  }
  /**
   * `File` size in bytes.
   */
  public UploadFileInput size(ch.brix.gql.client.frontify.scalars.BigIntScalar v) {
    values.put("size", v);
    return this;
  }
  /**
   * `File` chunk size in bytes. Value must be integer between 5MB and 1GB.
   */
  @ch.brix.gql.client.DefaultValue("104857600")
  public UploadFileInput chunkSize(ch.brix.gql.client.frontify.scalars.BigIntScalar v) {
    values.put("chunkSize", v);
    return this;
  }
}

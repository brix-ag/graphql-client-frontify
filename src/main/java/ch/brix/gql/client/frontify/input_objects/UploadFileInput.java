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
   * `File` size in bytes. Value must be a positive integer up to 5TB.
   */
  public UploadFileInput size(ch.brix.gql.client.frontify.scalars.BigIntScalar v) {
    values.put("size", v);
    return this;
  }
}

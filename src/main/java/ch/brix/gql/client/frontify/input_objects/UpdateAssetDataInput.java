package ch.brix.gql.client.frontify.input_objects;

public class UpdateAssetDataInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` title or display name.
   */
  public UpdateAssetDataInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * `Asset` filename, including extension.
   */
  public UpdateAssetDataInput filename(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("filename", v);
    return this;
  }
  /**
   * `Asset` description.
   */
  public UpdateAssetDataInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
  /**
   * Change `Asset` copyright details.
   */
  public UpdateAssetDataInput copyright(ch.brix.gql.client.frontify.input_objects.UpdateCopyrightInput v) {
    values.put("copyright", v);
    return this;
  }
  /**
   * Modify expiry date. `Asset` will expire once the defined date is reached.
   */
  public UpdateAssetDataInput expiresAt(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("expiresAt", v);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public UpdateAssetDataInput author(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("author", v);
    return this;
  }
}

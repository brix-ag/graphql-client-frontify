package ch.brix.gql.client.frontify.input_objects;

public class CustomMetadataPropertyPositionInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` Id used as positional reference for `BEFORE` and `AFTER` placements.
   */
  public CustomMetadataPropertyPositionInput targetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("targetId", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` position placement.
   */
  public CustomMetadataPropertyPositionInput placement(ch.brix.gql.client.frontify.enums.CustomMetadataPropertyPositionPlacement v) {
    values.put("placement", v);
    return this;
  }
}

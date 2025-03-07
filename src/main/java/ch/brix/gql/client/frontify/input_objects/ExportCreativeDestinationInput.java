package ch.brix.gql.client.frontify.input_objects;

public class ExportCreativeDestinationInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Project` Id destination for the exported Creative.
   */
  public ExportCreativeDestinationInput destinationId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("destinationId", v);
    return this;
  }
  /**
   * **BETA** `Title` of file.
   */
  public ExportCreativeDestinationInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
}

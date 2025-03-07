package ch.brix.gql.client.frontify.input_objects;

public class ExportCreativeOptionsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Format` of exported file.
   */
  public ExportCreativeOptionsInput format(ch.brix.gql.client.frontify.enums.CreativeExportFormat v) {
    values.put("format", v);
    return this;
  }
  /**
   * **BETA** `Quality` of exported file. Supported only for `JPG` `Format`.
   */
  public ExportCreativeOptionsInput quality(ch.brix.gql.client.frontify.enums.CreativeExportQuality v) {
    values.put("quality", v);
    return this;
  }
  /**
   * **BETA** `TransparentBackground` export parameter. Supported only by `PNG` `Format`.
   */
  public ExportCreativeOptionsInput hasTransparentBackground(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasTransparentBackground", v);
    return this;
  }
  /**
   * **BETA** `Cropmarks` export parameter.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public ExportCreativeOptionsInput hasCropmarks(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasCropmarks", v);
    return this;
  }
  /**
   * **BETA** `Bleed` export parameter.
   */
  public ExportCreativeOptionsInput bleed(ch.brix.gql.client.frontify.input_objects.ExportCreativeBleedInput v) {
    values.put("bleed", v);
    return this;
  }
  /**
   * **BETA** List of pages to export. If provided, validates that all requested pages exist in a template before export. If not provided, all pages will be exported.
   */
  public ExportCreativeOptionsInput pages(java.util.List<ch.brix.gql.client.frontify.scalars.IntScalar> v) {
    values.put("pages", v);
    return this;
  }
}

package ch.brix.gql.client.frontify.input_objects;

public class ExportCreativeOptionsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Format` of exported file.
   */
  public ExportCreativeOptionsInput format(ch.brix.gql.client.frontify.enums.CreativeExportFormat v) {
    values.put("format", v);
    return this;
  }
  /**
   * `Quality` of exported file. Supported only for `JPG` `Format`.
   */
  public ExportCreativeOptionsInput quality(ch.brix.gql.client.frontify.enums.CreativeExportQuality v) {
    values.put("quality", v);
    return this;
  }
  /**
   * `TransparentBackground` export parameter. Supported only by `PNG` `Format`.
   */
  public ExportCreativeOptionsInput hasTransparentBackground(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasTransparentBackground", v);
    return this;
  }
  /**
   * List of pages to export. If provided, validates that all requested pages exist in a template before export. If not provided, all pages will be exported.
   */
  public ExportCreativeOptionsInput pages(java.util.List<ch.brix.gql.client.frontify.scalars.IntScalar> v) {
    values.put("pages", v);
    return this;
  }
}

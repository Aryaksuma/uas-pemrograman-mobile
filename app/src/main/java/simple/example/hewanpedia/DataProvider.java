package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Burung;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;
import simple.example.hewanpedia.model.Ular;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular(ctx.getString(R.string.anaconda_nama), ctx.getString(R.string.anaconda_asal),
                ctx.getString(R.string.anaconda_deskripsi), R.drawable.anaconda));
        ulars.add(new Ular(ctx.getString(R.string.beludak_nama), ctx.getString(R.string.beludak_asal),
                ctx.getString(R.string.beludak_deskripsi), R.drawable.beludak));
        ulars.add(new Ular(ctx.getString(R.string.cobra_nama), ctx.getString(R.string.cobra_asal),
                ctx.getString(R.string.cobra_deskripsi), R.drawable.cobra));
        ulars.add(new Ular(ctx.getString(R.string.mamba_nama), ctx.getString(R.string.mamba_asal),
                ctx.getString(R.string.mamba_deskripsi), R.drawable.mamba));
        ulars.add(new Ular(ctx.getString(R.string.sanca_nama), ctx.getString(R.string.sanca_asal),
                ctx.getString(R.string.sanca_deskripsi), R.drawable.sanca));
        ulars.add(new Ular(ctx.getString(R.string.taipan_nama), ctx.getString(R.string.taipan_asal),
                ctx.getString(R.string.taipan_deskripsi), R.drawable.taipan));

        return ulars;
    }

    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan(ctx.getString(R.string.arwana_nama), ctx.getString(R.string.arwana_asal),
                ctx.getString(R.string.arwana_deskripsi), R.drawable.arwana));
        ikans.add(new Ikan(ctx.getString(R.string.cupang_nama), ctx.getString(R.string.cupang_asal),
                ctx.getString(R.string.cupang_deskripsi), R.drawable.cupang));
        ikans.add(new Ikan(ctx.getString(R.string.ikanmas_nama), ctx.getString(R.string.ikanmas_asal),
                ctx.getString(R.string.ikanmas_deskripsi), R.drawable.mas));
        ikans.add(new Ikan(ctx.getString(R.string.gupi_nama), ctx.getString(R.string.gupi_asal),
                ctx.getString(R.string.gupi_deskripsi), R.drawable.gupi));
        ikans.add(new Ikan(ctx.getString(R.string.hiu_nama), ctx.getString(R.string.hiu_asal),
                ctx.getString(R.string.hiu_deskripsi), R.drawable.hiu));
        ikans.add(new Ikan(ctx.getString(R.string.nemo_nama), ctx.getString(R.string.nemo_asal),
                ctx.getString(R.string.nemo_deskripsi), R.drawable.nemo));

        return ikans;
    }

    private static List<Burung>initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung(ctx.getString(R.string.hantu_nama), ctx.getString(R.string.hantu_asal),
                ctx.getString(R.string.hantu_deskripsi), R.drawable.burunghantu));
        burungs.add(new Burung(ctx.getString(R.string.kolibri_nama), ctx.getString(R.string.kolibri_asal),
                ctx.getString(R.string.kolibri_deskripsi), R.drawable.kolibri));
        burungs.add(new Burung(ctx.getString(R.string.kuntul_nama), ctx.getString(R.string.kuntul_asal),
                ctx.getString(R.string.kuntul_deskripsi), R.drawable.kuntul));
        burungs.add(new Burung(ctx.getString(R.string.merpati_nama), ctx.getString(R.string.merpati_asal),
                ctx.getString(R.string.merpati_deskripsi), R.drawable.merpati));
        burungs.add(new Burung(ctx.getString(R.string.penguin_nama), ctx.getString(R.string.penguin_asal),
                ctx.getString(R.string.penguin_deskripsi), R.drawable.penguin));
        burungs.add(new Burung(ctx.getString(R.string.potoo_nama), ctx.getString(R.string.potoo_asal),
                ctx.getString(R.string.potoo_deskripsi), R.drawable.potoo));

        return burungs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataIkan(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
